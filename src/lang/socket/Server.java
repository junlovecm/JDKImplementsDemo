package lang.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int port = 8080;// �����Ķ˿ں�
	private ServerSocket serverSocket;

	public static void main(String[] args) {
		System.out.println("Server...\n");
		Server server = new Server();
		server.init();
	}

	public void init() {
		try {
			serverSocket = new ServerSocket(port);
			while (true) {
				// �����������ȡ��һ������
				Socket client = serverSocket.accept();
				// �����������
				new HandlerThread(client);
			}
		} catch (Exception e) {
			System.out.println("�������쳣: " + e.getMessage());
		}
	}

	private class HandlerThread implements Runnable {
		private Socket socket;

		public HandlerThread(Socket client) {
			socket = client;
			new Thread(this).start();
		}

		public void run() {
			try {
				// ��ȡ�ͻ�������
				BufferedReader input = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				String clientInputStr = input.readLine();// ����Ҫע��Ϳͻ����������д������Ӧ,�������
															// EOFException
				// ����ͻ�������
				System.out.println("�ͻ��˷�����������:" + clientInputStr);

				// ��ͻ��˻ظ���Ϣ
				PrintStream out = new PrintStream(socket.getOutputStream());
				System.out.print("������:\t");
				// ���ͼ��������һ��
				String s = new BufferedReader(new InputStreamReader(System.in))
						.readLine();
				out.println(s);

				out.close();
				input.close();
			} catch (Exception e) {
				System.out.println("������ run �쳣: " + e.getMessage());
			} finally {
				if (socket != null) {
					try {
						socket.close();
					} catch (Exception e) {
						socket = null;
						System.out.println("����� finally �쳣:" + e.getMessage());
					}
				}
			}
		}
	}
}
