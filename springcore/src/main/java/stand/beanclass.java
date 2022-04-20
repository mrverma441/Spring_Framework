package stand;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class beanclass {
	private List<String>friends;
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	private Properties properties;
	@Override
	public String toString() {
		return "beanclass [friends=" + friends + ", fs=" + fs + "]";
	}

	private Map<String, Integer>fs;

	public Map<String, Integer> getFs() {
		return fs;
	}

	public void setFs(Map<String, Integer> fs) {
		this.fs = fs;
	}


	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}


}
