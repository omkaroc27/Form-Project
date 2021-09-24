package com.FromTest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="data")

public class Data{

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	private String fname;
	
	
	private String dtime;
	
	private String gender;
	
	
	private String loc;
	
	
	private String email;
	
	   @Lob
	   @Column(name = "file")
	    private byte[] dfile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getDfile() {
		return dfile;
	}

	public void setDfile(byte[] dfile) {
		this.dfile = dfile;
	}

	

	
	
}
