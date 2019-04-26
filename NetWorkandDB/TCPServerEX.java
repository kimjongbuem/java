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
			try {serverSocket = new ServerSocket(5000); // 포트 5000
			System.out.println("요청대기");
			while(true) {socket = serverSocket.accept();
			System.out.println("접속한 클라이언트"+socket.getInetAddress());
			is = socket.getInputStream(); 
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);
			
			String msg = (String)ois.readObject();
			System.out.println("클라이언트에서 보낸 메시지 : "+msg);
			String retrunMsg = "서버서 되돌아 온 메시지 "+ msg;
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

