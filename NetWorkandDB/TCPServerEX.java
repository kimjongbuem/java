package NetWorkandDB;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServerEX extends Thread{
	private Socket socket;
	private ServerSocket serverSocket;
	private InputStream is;
	private OutputStream os; private ObjectInputStream ois;  private ObjectOutputStream oos;
	public void run() {
			try {serverSocket = new ServerSocket(5000); // ��Ʈ 5000
			System.out.println("��û���");
			while(true) {socket = serverSocket.accept();
			System.out.println("������ Ŭ���̾�Ʈ"+socket.getInetAddress());
			is = socket.getInputStream(); 
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);
			
			String msg = (String)ois.readObject();
			System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� : "+msg);
			String retrunMsg = "������ �ǵ��� �� �޽��� "+ msg;
			oos.writeObject(retrunMsg);
			socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public static void main(String[] args) {
		new TCPServerEX().start();
	}
}

