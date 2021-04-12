package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource; //사스 방식.

public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document =null;
		
		try {
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg= br.readLine()) != null) {
				sb.append(msg + "\n");
				
			}
			// xml 파싱하기 : 페이지에 접근해줄 Document 객체 생성
			InputSource is = new InputSource(new StringReader(sb.toString()));
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			
//			StringBuffer 저장된 내용 읽기 사스방식.
			//1. local 태그들을 추출한다. (여러개이면 배열에 저장된다.)
			NodeList local=  document.getElementsByTagName("local");			

			//2. for 문을 사용해 local갯수만큼 반복.
			StringBuffer sb2 = new StringBuffer();
			for(int i = 0; i < local.getLength(); i++)
			{//태그의 글자 추출.
				sb2.append(local.item(i).getFirstChild().getNodeValue()+",   ");
				// 태그의 속성 추출.
				sb2.append( ((Element)local.item(i)).getAttribute("ta")+ ",   ");
				sb2.append( ((Element)local.item(i)).getAttribute("desc")+"\n");
				
			}
			System.out.println(sb2.toString());
		} catch (Exception e) {
		}finally {
			try {
					br.close();
					
					
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
