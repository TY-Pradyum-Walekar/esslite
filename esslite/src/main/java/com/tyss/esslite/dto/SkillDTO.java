package com.tyss.esslite.dto;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(name = "skill")
@JsonRootName("SkillDTO")
public class SkillDTO {

	@Id
	@Column
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillid;
	@Column
	@JsonProperty
	private String skilldesc;
	@Column
	@JsonProperty
	private int techid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="techid", insertable = false , updatable = false)
	private TechnologyLookUpDTO technologylookupdto;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "skillid")
	private List<TechnologyDTO> technology;
	
	
////	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="skillid",insertable = false, updatable = false)
//	private TechnologyDTO technology;

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public String getSkilldesc() {
		return skilldesc;
	}

	public void setSkilldesc(String skilldesc) {
		this.skilldesc = skilldesc;
	}

	public TechnologyLookUpDTO getTechnologylookupdto() {
		return technologylookupdto;
	}

	public void setTechnologylookupdto(TechnologyLookUpDTO technologylookupdto) {
		this.technologylookupdto = technologylookupdto;
	}
	
	

}
