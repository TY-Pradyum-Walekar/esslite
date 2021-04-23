package com.tyss.esslite.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.ToString.Exclude;

@Entity
@Table(name = "technologylookup")
public class TechnologyLookUpDTO {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int techid;
	
	@Column
	private String techdesc;
	@Exclude
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "technologylookupdto")
	private List<SkillDTO> skill;
	
	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public String getTechdesc() {
		return techdesc;
	}
	public void setTechdesc(String techdesc) {
		this.techdesc = techdesc;
	}
	public List<SkillDTO> getSkill() {
		return skill;
	}
	public void setSkill(List<SkillDTO> skill) {
		this.skill = skill;
	}

}
