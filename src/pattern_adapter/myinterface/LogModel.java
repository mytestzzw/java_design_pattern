package pattern_adapter.myinterface;

import java.io.Serializable;

public class LogModel implements Serializable {
    private String id;
    private String date;
    private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "LogModel [id=" + id + ", date=" + date + ", content=" + content + "]";
	}
    
}
