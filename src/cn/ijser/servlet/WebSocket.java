package cn.ijser.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;

/**
 * Servlet implementation class WebSocket
 */
@WebServlet("/WebSocket")
public class WebSocket extends WebSocketServlet  {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebSocket() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected StreamInbound createWebSocketInbound(String msg,
			HttpServletRequest request) {
		System.out.println("##########" + msg);
        MyMessageInbound mmib = new MyMessageInbound();

        return mmib;
	}

}
