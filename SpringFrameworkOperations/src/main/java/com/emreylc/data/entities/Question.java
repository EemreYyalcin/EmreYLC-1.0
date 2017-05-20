package com.emreylc.data.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "question")
	private String question;

	@Column(name = "clickA")
	private int clickA;

	@Column(name = "clickB")
	private int clickB;

	@ManyToMany(mappedBy = "questions", fetch = FetchType.EAGER)
	private Collection<Option> options = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getClickA() {
		return clickA;
	}

	public void setClickA(int clickA) {
		this.clickA = clickA;
	}

	public int getClickB() {
		return clickB;
	}

	public void setClickB(int clickB) {
		this.clickB = clickB;
	}

	public Collection<Option> getOptions() {
		return options;
	}

	public void setOptions(Collection<Option> options) {
		this.options = options;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", clickA=" + clickA + ", clickB=" + clickB + "]";
	}

}
