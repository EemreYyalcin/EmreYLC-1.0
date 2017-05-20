package com.emreylc.data.entities;

import java.io.Serializable;
import java.util.BitSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@OneToOne
	@JoinColumn(name = "categoryId")
	private Category category;
	
	@Column(name="answers1")
	private BitSet answers1 = new BitSet();
	
	@Column(name="answers2")
	private BitSet answers2 = new BitSet();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public BitSet getAnswers1() {
		return answers1;
	}

	public void setAnswers1(BitSet answers1) {
		this.answers1 = answers1;
	}

	public BitSet getAnswers2() {
		return answers2;
	}

	public void setAnswers2(BitSet answers2) {
		this.answers2 = answers2;
	}

		
	

}
