package Lab2.bt11a;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql.hienThiDanhSach();

		sc.close();
	}

}
