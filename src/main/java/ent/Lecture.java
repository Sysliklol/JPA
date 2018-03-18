package ent;
import javax.persistence.*;

@Entity
@Table(name="Lectures")
public class Lecture {
		@Id
		@GeneratedValue
		@Column(name = "ID")
		private int id;
		@Lob
		private String name;
		private double credits;
		
		
		
		public Lecture() {
			
		}
		
		
		
		public Lecture(String name, double credits) {
			super();
			this.name = name;
			this.credits = credits;
		}



		public Lecture(int id, String name, double credits) {
			super();
			this.id = id;
			this.name = name;
			this.credits = credits;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getCredits() {
			return credits;
		}
		
		public void setCredits(double credits) {
			this.credits = credits;
		}



}
