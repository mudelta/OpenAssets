package org.hackathon.openassets.model;

import com.mongodb.DBObject;

public class MappedDocument {

	private String trusted;
	
	private String ep_object_id;

	private String document_id;
	
	

	public String getEp_object_id() {
		return ep_object_id;
	}

	public void setEp_object_id(String ep_object_id) {
		this.ep_object_id = ep_object_id;
	}

	public String getDocument_id() {
		return document_id;
	}

	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}

	public String getTrusted() {
		return trusted;
	}

	public void setTrusted(String trusted) {
		this.trusted = trusted;
	}
	
	
	
	
	
	
}
