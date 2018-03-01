package com.wtf.datastructure.obj;

public class MapEntry {

	private String key;
	private Object value;

	public MapEntry(String key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		int ascii = key.charAt(0);
		return ascii % 100;
	}

	@Override
	public boolean equals(Object obj) {
		MapEntry entry = (MapEntry) obj;
		return this.key.equals(String.valueOf(entry.getKey()));
	}
}
