package org.hackathon.openassets.model;

import java.util.List;

import org.hackathon.openassets.model.input.AssetesData;

public class DocumentForm {

	private String ep_object_id;

	private String document_id;

	private AssetesData assets_data;

	private List<String> images;

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

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

	public void setAssets_data(AssetesData assets_data) {
		this.assets_data = assets_data;
	}

	public AssetesData getAssets_data() {
		return assets_data;
	}

}