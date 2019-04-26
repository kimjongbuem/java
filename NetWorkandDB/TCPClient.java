package NetWorkandDB;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class TCPClient {
	private Socket socket;
	private ServerSocket serverSocket;
	private InputStream is;
	private OutputStream os; private ObjectInputStream ois; 
	private ObjectOutputStream oos;
	String rMsg;
	Scanner sc;
	public void start() {
		try {
			socket = new Socket("localhost",5000);
			sendMessage(socket);
			receiveMessage(socket);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void sendMessage(Socket socket) {
		try {
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			System.out.println("보낼 메시지 : "); 
			sc = new Scanner(System.in);
			String sMsg = sc.next();
			oos.writeObject(sMsg);
		}catch(Exception e) {
			
		}
	}
	private void receiveMessage(Socket socket) {
		try {
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			rMsg = (String)ois.readObject();
			System.out.println(rMsg);
		}catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		TCPClient tcpClient = new TCPClient();
		tcpClient.start();

	}

}
