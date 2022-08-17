package com.uni.section02.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		/*
		 *  * Socket
		 *  - 프로세스간의 통신을 담당
		 *  - input / outputStream을 보유(이 스트림을 통해 프로세스간의 통신(입/출력)이 이루어짐)
		 *  
		 *  * ServerSocket
		 *  - 포트와 연결(Bind)되어 외부의 연결 요청을 기다리다 연결요청이 들어오면
		 *    Socket을 생성하여 소켓과 소켓간의 통신이 이루어 지도록 함
		 *  - 한 포트에 하나의 ServerSocket만 연결할 수 있다. 
		 */
		
		/*
		 * 서버용 TCP 소켓 프로그래밍 순서
		 * 
		 * 1) 서버의 포트번호 정함
		 * 2) 서버용 소켓 객체 생성 시 포트와 결합
		 * 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
		 * 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
		 * 5) 연결된 클라이언트와 입출력 스트림 생성
		 * 6) 보조스트림을 통해 성능 개선
		 * 7) 스트림을 통해 읽고 쓰기
		 * 8) 통신 종료
		 */
		
		//1. 서버의 포트를 정함 (0~ 65535)
		int port = 8500;
		
		try {
			//2. 서버용 소켓 만들기
			ServerSocket server = new ServerSocket(port);
			
			//3. 클라이언트로 부터 접속요청이 올 때 까지 대기
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			//4. 접속요청이 오면 요청을 수락후 해당 클라이언트에 대한 소켓객체를 생성
			Socket client = server.accept();
			
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "가 연결을 요청함");
			
			//5. 연결된 클라이언트와 입출력 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			//6. 보조스트림을 통한 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(output);
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				//7. 스트림을 통한 읽고 쓰기
				
				//클라이언트에서 서버로 전송된 메세지를 읽어들임
				String message = br.readLine();
				
				if(message != null && !message.equals("exit")) {
					System.out.println(clientIp + "가 보낸 메시지 : " + message);
					
					//서버가 클라이언트로 메시지 전송
					System.out.println("대화입력 : ");
					String msg = sc.nextLine();
					
					pw.println(msg);
					pw.flush();
					
				}else {
					System.out.println("접속종료");
					break;
				}
			}
			
			br.close();
			pw.close();
			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
