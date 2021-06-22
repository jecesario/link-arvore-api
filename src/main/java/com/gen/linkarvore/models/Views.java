package com.gen.linkarvore.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@Entity
public class Views {

	private Date view_date;
	private Integer total;

	@ManyToOne
	@JoinColumn(name = "id_page")
	private Pages pages;

	public Views() {
		super();
	}

	public Views(Date view_date, Integer total, Pages pages) {
		super();
		this.view_date = view_date;
		this.total = total;
		this.pages = pages;
	}

	public Date getView_date() {
		return view_date;
	}

	public void setView_date(Date view_date) {
		this.view_date = view_date;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Pages getPages() {
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}

}
