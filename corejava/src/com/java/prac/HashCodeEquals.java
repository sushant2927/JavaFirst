package com.java.prac;

public class HashCodeEquals {

	int empid;
	String empName;
	int empDOJ;
	public HashCodeEquals(int empid, String empName, int empDOJ) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empDOJ = empDOJ;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpDOJ() {
		return empDOJ;
	}
	public void setEmpDOJ(int empDOJ) {
		this.empDOJ = empDOJ;
	}
	@Override
	public String toString() {
		return "HashCodeEquals [empid=" + empid + ", empName=" + empName + ", empDOJ=" + empDOJ + "]";
	}
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + empDOJ; result = prime * result + ((empName ==
	 * null) ? 0 : empName.hashCode()); result = prime * result + empid; return
	 * result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; HashCodeEquals other = (HashCodeEquals) obj; if (empDOJ !=
	 * other.empDOJ) return false; if (empName == null) { if (other.empName != null)
	 * return false; } else if (!empName.equals(other.empName)) return false; if
	 * (empid != other.empid) return false; return true; }
	 */
	public int compareTo(HashCodeEquals o) {
		// TODO Auto-generated method stub
		return (this.empid < o.empid ) ? -1: (this.empid > o.empid ) ? 1:0 ;
	}

	
	
	
}
