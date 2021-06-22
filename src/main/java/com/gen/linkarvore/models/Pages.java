package com.gen.linkarvore.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@Entity
public class Pages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String slug;

	private String op_font_color;
	private String op_bg_type;
	private String op_bg_value;
	private String op_profile_image;
	private String op_description;
	private String op_fb_pixel;

	@ManyToMany(mappedBy = "pages")
	@JoinColumn(name = "id_user")
	private List<Users> users = new ArrayList<>();

	public Pages() {
		super();
	}

	public Pages(Integer id, String slug, String op_font_color, String op_bg_type, String op_bg_value,
			String op_profile_image, String op_description, String op_fb_pixel, List<Users> users) {
		super();
		this.id = id;
		this.slug = slug;
		this.op_font_color = op_font_color;
		this.op_bg_type = op_bg_type;
		this.op_bg_value = op_bg_value;
		this.op_profile_image = op_profile_image;
		this.op_description = op_description;
		this.op_fb_pixel = op_fb_pixel;
		this.users = users;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getOp_font_color() {
		return op_font_color;
	}

	public void setOp_font_color(String op_font_color) {
		this.op_font_color = op_font_color;
	}

	public String getOp_bg_type() {
		return op_bg_type;
	}

	public void setOp_bg_type(String op_bg_type) {
		this.op_bg_type = op_bg_type;
	}

	public String getOp_bg_value() {
		return op_bg_value;
	}

	public void setOp_bg_value(String op_bg_value) {
		this.op_bg_value = op_bg_value;
	}

	public String getOp_profile_image() {
		return op_profile_image;
	}

	public void setOp_profile_image(String op_profile_image) {
		this.op_profile_image = op_profile_image;
	}

	public String getOp_description() {
		return op_description;
	}

	public void setOp_description(String op_description) {
		this.op_description = op_description;
	}

	public String getOp_fb_pixel() {
		return op_fb_pixel;
	}

	public void setOp_fb_pixel(String op_fb_pixel) {
		this.op_fb_pixel = op_fb_pixel;
	}

}
