package com.Kwon.ch07Project;

public class StudentDTO {
	
		private String name;
		private int no;
		private String grade;
		private String address;
		private long phone;
		
		public StudentDTO(){}//4-1번
		public StudentDTO(String name, int no, String grade, String address, long phone){
			super();
			this.name = name;
			this.no = no;
			this.grade = grade;
			this.phone = phone;
		}//4-2번;
		
		public StudentDTO(String name, int no, String grade) {}//4-3번;
		
		//5번 시작
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
}

/*1. StudentDTO를 만듦(StudentDTO.java)
 *2. 멤버변수를 전부 접근 제어자를 private로 한다.
 *3. 멤버변수는 name,no(학번),grade(학년),address,phone으로 한다.
 *4. 생성자는 기본형과 모든 멤버변수를 파라메터로 하는 생성자, name, no, grade만 파라메터로 하는 생성자를 만듦(3개)
 *5. Getter 와 Setter 메서드를 만듦 
 *6. main 메서드에서 StudentDTO객체를 sdto로 하여 만드는데 객체 생성시 StudentDTO의 모든 변수를 사용하는 생성자를 사용하여 만듦(생성자 순서대로,값은 임의로)
 *7. StudentDTO의 각 멤버변수를 출력
 *8. StudentDTO의 각 멤버변수를 변경해보시오 (값은 임의로)
 *9. 8번 풀이 후 멤버변수를 출력
 */

