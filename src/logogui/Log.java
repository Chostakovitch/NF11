package logogui;

import javafx.scene.control.TextArea;


public class Log {
	private static Log instance;
	private TextArea logZone;
	private StringBuilder sb = new StringBuilder();
	public static Log getInstance() {
		if (instance == null) {
			instance = new Log();
		}
		return instance;
	}
	public void setLogZone(TextArea zone) {
		logZone = zone;
	}
	public static void append(String s) {
		getInstance().getStringBuilder().append(s);
	}

	public static void flush() {
		getInstance().getLogZone().appendText(getInstance().getStringBuilder().toString());
	}
	public TextArea getLogZone() {
		return logZone;
	}
	public StringBuilder getStringBuilder() {
		return sb;
	}
}
