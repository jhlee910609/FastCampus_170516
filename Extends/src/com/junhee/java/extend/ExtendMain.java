package com.junhee.java.extend;

import java.util.ArrayList;

import com.junhee.java.city.Police;
import com.junhee.java.city.hospital.*;
import com.junhee.java.city.hospital.Hospital;
import com.junhee.java.city.hospital.Nurse;
import com.junhee.java.city.hospital.Patient;
import com.junhee.java.obj.Father;
import com.junhee.java.obj.Son;

public class ExtendMain {

	public static void main(String[] agrs) {

		// 의사 3 명, 환자 21 명, 간호사 6명 만들기.
		Doctor dr[] = new Doctor[3];
		Patient pt[] = new Patient[21];
		Nurse nr[] = new Nurse[6];

		// 병원 1 개 건설. 속성 정보 저장
		Hospital hospital = new Hospital();
		hospital.doctor = dr.length;
		hospital.nurse = nr.length;
		hospital.patient = pt.length;
		/*
		 * // <------ 객체 별 이름 메소드 갖기 --------> for(int i = 0; i < job.lenght;
		 * i++) { job[i] = new Job (); job[i].setName("Job name = " + (i+1)); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 **/

		// 초기화 & 객체 값 지정.
		for (int i = 0; i < dr.length; i++) {
			// 초기화 시키기
			dr[i] = new Doctor();
			dr[i].setName("Doctor name = " + (i + 1));
		}

		for (int k = 0; k < pt.length; k++) {
			// 초기화 시키기
			pt[k] = new Patient();
			pt[k].setName("Patient name = " + (k + 1));
			if (k < 7) {
				pt[k].myDoctor(dr[0].getName());
			} else if (k < 14) {
				pt[k].myDoctor(dr[1].getName());
			} else {
				pt[k].myDoctor(dr[2].getName());
			}
		}

		for (int l = 0; l < nr.length; l++) {
			// 초기화 시키기
			nr[l] = new Nurse();
			nr[l].setName("Nurse name = " + (l + 1));
		}

		// 의사 별 환자 지정하기
		
		
		for (int i = 0; i < pt.length; i++) {
			pt[i].tellMyDocter();
		}

		for (int k = 0; k < nr.length; k++) {
			System.out.print(nr[k].getName() + " 번 째 간호사가 ");
			nr[k].move(k);
		}
	}
}

/*
 * Police police = new Police(); police.floor = "2"; police.color = "Blue";
 * 
 * Father fa = new Father(); fa.totalProcess(); // Fix에 있는
 * 
 */

// 메모리 1개 생성
// <-- 부모 객체 Father --->
/*
 * Father father = new Father(); father.lastname = "조던"; father.name = "마이클";
 * father.car = "람보르기니"; father.money = 10000000;
 * 
 */
// <---- 상속 받은 son 인스턴스 --->
// 메모리 1개 생성 (2개 영역)
// 설계 시, 포괄적으로 포함할 수 있도록 변수(클래스 멤버)를 설정해주는 것이 좋음.

// <---- Son 인스턴스 생성 ---->
/*
 * Son son = new Son(); son.lastname = "조던"; son.name = "쥬니어"; son.money = 0;
 * son.wife = "수지"; son.girlfriend = "수지";
 * 
 * System.out.println(son.wife);
 * 
 */
