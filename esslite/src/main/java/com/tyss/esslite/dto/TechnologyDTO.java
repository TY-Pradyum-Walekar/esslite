package com.tyss.esslite.dto;

import java.util.List;

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
import com.sun.istack.NotNull;

import lombok.ToString.Exclude;

@Entity
@Table(name = "technology")
@JsonRootName("TechnologyDTO")
public class TechnologyDTO {

	@Id
	@Column
	@JsonProperty
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emptechid;
	@Column
	@JsonProperty
	private String employeeid;
	@Column
	@JsonProperty
	private int skillid;
	@Column
	@JsonProperty
	private int rating;

	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "skillid", unique = true, nullable = false, insertable = false, updatable = false)
	private SkillDTO skill;

	public TechnologyDTO(String employeeid, int emptechid, int skillid, int rating, SkillDTO skills) {
		// TODO Auto-generated constructor stub
		super();
		this.emptechid = emptechid;
		this.employeeid = employeeid;
		this.skillid = skillid;
		this.rating = rating;
		

		
		
	}
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "technology")
//	private List<SkillDTO> skill;
//	

	public int getEmptechid() {
		return emptechid;
	}

	public void setEmptechid(int emptechid) {
		this.emptechid = emptechid;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public SkillDTO getSkill() {
		return skill;
	}

	public void setSkill(SkillDTO skill) {
		this.skill = skill;
	}

	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "emptechid",unique =true ,nullable =false, insertable =
	 * false, updatable = false) private TechnologyLookUpDTO technologydto;
	 */

}
