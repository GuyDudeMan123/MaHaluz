package com.main;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shifts")
public class Shifts implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private Employee employee;
	private boolean sunday1;
	private boolean sunday2;
	private boolean sunday3;
	private boolean sunday4;
	private boolean sunday5;
	private boolean monday1;
	private boolean monday2;
	private boolean monday3;
	private boolean tuesday1;
	private boolean tuesday2;
	private boolean tuesday3;
	private boolean wednesday1;
	private boolean wednesday2;
	private boolean wednesday3;
	private boolean thursday1;
	private boolean thursday2;
	private boolean thursday3;
	private boolean thursday4;
	private boolean thursday5;
	private boolean friday1;
	//TODO implement date
	private Date date;

	public Shifts() {
	}
	public Shifts(Employee emp, boolean[] shiftsArray) throws Exception {
		this.employee = emp;
		setShifts(shiftsArray);
	}
	public Shifts(Employee emp) {
		this.employee = emp;
	}
	
	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	public Employee getEmployee() {
		return employee;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setEmployee(Employee emp) {
		this.employee = emp;
	}

	@Column(name = "date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "sunday1")
	public boolean isSunday1() {
		return sunday1;
	}

	public void setSunday1(boolean sunday1) {
		this.sunday1 = sunday1;
	}

	@Column(name = "sunday2")
	public boolean isSunday2() {
		return sunday2;
	}

	public void setSunday2(boolean sunday2) {
		this.sunday2 = sunday2;
	}

	@Column(name = "sunday3")
	public boolean isSunday3() {
		return sunday3;
	}

	public void setSunday3(boolean sunday3) {
		this.sunday3 = sunday3;
	}

	@Column(name = "sunday4")
	public boolean isSunday4() {
		return sunday4;
	}

	public void setSunday4(boolean sunday4) {
		this.sunday4 = sunday4;
	}

	@Column(name = "sunday5")
	public boolean isSunday5() {
		return sunday5;
	}

	public void setSunday5(boolean sunday5) {
		this.sunday5 = sunday5;
	}

	@Column(name = "monday1")
	public boolean isMonday1() {
		return monday1;
	}

	public void setMonday1(boolean monday1) {
		this.monday1 = monday1;
	}

	@Column(name = "monday2")
	public boolean isMonday2() {
		return monday2;
	}

	public void setMonday2(boolean monday2) {
		this.monday2 = monday2;
	}

	@Column(name = "monday3")
	public boolean isMonday3() {
		return monday3;
	}

	public void setMonday3(boolean monday3) {
		this.monday3 = monday3;
	}

	@Column(name = "tuesday1")
	public boolean isTuesday1() {
		return tuesday1;
	}

	public void setTuesday1(boolean tuesday1) {
		this.tuesday1 = tuesday1;
	}

	@Column(name = "tuesday2")
	public boolean isTuesday2() {
		return tuesday2;
	}

	public void setTuesday2(boolean tuesday2) {
		this.tuesday2 = tuesday2;
	}

	@Column(name = "tuesday3")
	public boolean isTuesday3() {
		return tuesday3;
	}

	public void setTuesday3(boolean tuesday3) {
		this.tuesday3 = tuesday3;
	}

	@Column(name = "wednesday1")
	public boolean isWednesday1() {
		return wednesday1;
	}

	public void setWednesday1(boolean wednesday1) {
		this.wednesday1 = wednesday1;
	}

	@Column(name = "wednesday2")
	public boolean isWednesday2() {
		return wednesday2;
	}

	public void setWednesday2(boolean wednesday2) {
		this.wednesday2 = wednesday2;
	}

	@Column(name = "wednesday3")
	public boolean isWednesday3() {
		return wednesday3;
	}

	public void setWednesday3(boolean wednesday3) {
		this.wednesday3 = wednesday3;
	}

	@Column(name = "thursday1")
	public boolean isThursday1() {
		return thursday1;
	}

	public void setThursday1(boolean thursday1) {
		this.thursday1 = thursday1;
	}

	@Column(name = "thursday2")
	public boolean isThursday2() {
		return thursday2;
	}

	public void setThursday2(boolean thursday2) {
		this.thursday2 = thursday2;
	}

	@Column(name = "thursday3")
	public boolean isThursday3() {
		return thursday3;
	}

	public void setThursday3(boolean thursday3) {
		this.thursday3 = thursday3;
	}

	@Column(name = "thursday4")
	public boolean isThursday4() {
		return thursday4;
	}

	public void setThursday4(boolean thursday4) {
		this.thursday4 = thursday4;
	}

	@Column(name = "thursday5")
	public boolean isThursday5() {
		return thursday5;
	}

	public void setThursday5(boolean thursday5) {
		this.thursday5 = thursday5;
	}

	@Column(name = "friday1")
	public boolean isFriday1() {
		return friday1;
	}

	public void setFriday1(boolean friday1) {
		this.friday1 = friday1;
	}

	public boolean[] getShifts() {
		boolean[] shifts = new boolean[20];
		try {
			shifts[0] = isSunday1();
			shifts[1] = isSunday2();
			shifts[2] = isSunday3();
			shifts[3] = isSunday4();
			shifts[4] = isSunday5();
			shifts[5] = isMonday1();
			shifts[6] = isMonday2();
			shifts[7] = isMonday3();
			shifts[8] = isTuesday1();
			shifts[9] = isTuesday2();
			shifts[10] = isTuesday3();
			shifts[11] = isWednesday1();
			shifts[12] = isWednesday2();
			shifts[13] = isWednesday3();
			shifts[14] = isThursday1();
			shifts[15] = isThursday2();
			shifts[16] = isThursday3();
			shifts[17] = isThursday4();
			shifts[18] = isThursday5();
			shifts[19] = isFriday1();
		} catch (NullPointerException e) {
			System.out.println("Shifts not set yet, array may not be complete");
			e.printStackTrace();
		}
		return shifts;
	}

	public void setShifts(boolean[] shifts) throws Exception {
		if (shifts.length != 20)
			throw new Exception("shifts is not the valid length (20)");
		setSunday1(shifts[0]);
		setSunday2(shifts[1]);
		setSunday3(shifts[2]);
		setSunday4(shifts[3]);
		setSunday5(shifts[4]);
		setMonday1(shifts[5]);
		setMonday2(shifts[6]);
		setMonday3(shifts[7]);
		setTuesday1(shifts[8]);
		setTuesday2(shifts[9]);
		setTuesday3(shifts[10]);
		setWednesday1(shifts[11]);
		setWednesday2(shifts[12]);
		setWednesday3(shifts[13]);
		setThursday1(shifts[14]);
		setThursday2(shifts[15]);
		setThursday3(shifts[16]);
		setThursday4(shifts[17]);
		setThursday5(shifts[18]);
		setFriday1(shifts[19]);
	}
}
