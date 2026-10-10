package myPack;

import java.util.Random;
import java.util.Scanner;

public class AdvanceBus {
	public static boolean timer() {
		try {
			for (int j = 0; j < 5; j++) {
				System.out.println("Fetching details...");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static boolean timers() {
		try {
			for (int j = 0; j < 5; j++) {
				System.out.println("Please wait...");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("🚌🚌🚌🚌🚌🚌BUS TICKET BOOKING SYSTEM🚌🚌🚌🚌🚌🚌");
		System.out.println("Enter the number of ticket");
		int ticketnumber = sc.nextInt();
		int fixpin = 12345;
		int pin = 0;
		int seatno = 0;
		int count = 0;
		int j = 0;
		long digit = 0;
		long phonenumber[] = new long[ticketnumber];
		int ticketid = 0;
		boolean isfound = false;
		String name[] = new String[ticketnumber];
		int age[] = new int[ticketnumber];
		String gender[] = new String[ticketnumber];
		String origin[] = new String[ticketnumber];

		String destination[] = new String[ticketnumber];
		sc.nextLine();
		double discount = 0.0;
		double discountamount = 0.0;
		double payamount = 0.0;
		double finalamount = 0.0;
		double acamount = 0.0;
		System.out.println("1.AC\n2.NON - AC");
		System.out.println("Please select ticket type");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			for (int i = 0; i < ticketnumber; i++) {
				 
				System.out.println("Enter your name here");
				name[i] = sc.nextLine();
				System.out.println("Enter your age here");
				age[i] = sc.nextInt();
				System.out.println("Enter your phone number");
				phonenumber[i] = sc.nextLong();
				System.out.println("Enter your gender");
				gender[i] = sc.next();
				sc.nextLine();
				System.out.println("Enter the origin place");
				origin[i] = sc.nextLine();
				System.out.println("Enter the destination");
				destination[i] = sc.nextLine();
				seatno++;

//				j = 0;

//				while (j < phonenumber[i]) {
//					digit = phonenumber[i] % 10;
//					count++;
//					phonenumber[i] /= 10;
//				}

			}
			timer();
//			if (count == 10) {
				System.out.println("Information fetched successfully");
				finalamount = 0;
				for (int i = 0; i < ticketnumber; i++) {
					if (age[i] > 0 && age[i] <= 5) {
						finalamount += 0;

					} else if (age[i] > 5 && age[i] < 60) {
						finalamount += 800;
					} else if (age[i] > 60) {
						discount = 800 * 20 / 100;
						discountamount = 800 - discount;
						finalamount += discountamount;
					}
				}
//			} else {
//				try {
//					throw new InvalidPhonenumberExceptions("Must contain 10 digit only");
//				} catch (InvalidPhonenumberExceptions e) {
//					e.printStackTrace();
//					return;
//				}
			
			System.out.println("FINAL PAYABLE AMOUNT  :" + finalamount);

			System.out.println("Enter the final amount");
			payamount = sc.nextDouble();

			if (payamount == finalamount) {
				System.out.println("Please enter your upi pin");
				pin = sc.nextInt();
				if (pin == fixpin) {
					timers();
					for (int i = 0; i < ticketnumber; i++) {
						ticketid = random.nextInt(34567) + 1;
						seatno = random.nextInt(50) + 1;
						System.out.println("⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕TICKET BOOKED SUCCESSFULLY⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕");
						System.out.println("                                      ");
						System.out.println("TICKET ID             :" + ticketid);
						System.out.println("NAME                  :" + name[i]);
						System.out.println("AGE                   :" + age[i]);
						System.out.println("PHONE NUMBER          :" + phonenumber[i]);
						System.out.println("GENDER                :" + gender[i]);
						System.out.println("TICKET TYPE           :" + "AC");
						System.out.println("BOARDING POINT        :" + origin[i]);
						System.out.println("DESTINATION           :" + destination[i]);
						System.out.println("BUS NUMBER            :" + "BR0987A");
						System.out.println("SEAT NUMBER           :" + seatno);

						if (age[i] > 0 && age[i] <= 5) {
							System.out.println("AMOUNT                :FREE TRAVEL");
						} else if (age[i] > 60) {
							System.out.println("DISCOUNT              :" + discount);
							System.out.println("PAID AMOUNT           :" + discountamount);
						} else {
							System.out.println("PAID AMOUNT           :" + 800);

						}
					}
				} else {
					System.out.println("Invalid Pin");
				}
			} else {
				System.out.println("Invalid Amount");
			}
	
			break;
		case 2:
			for (int i = 0; i < ticketnumber; i++) {
				 
				System.out.println("Enter your name here");
				name[i] = sc.nextLine();
				System.out.println("Enter your age here");
				age[i] = sc.nextInt();
				System.out.println("Enter your phone number");
				phonenumber[i] = sc.nextLong();
				System.out.println("Enter your gender");
				gender[i] = sc.next();
				sc.nextLine();
				System.out.println("Enter the origin place");
				origin[i] = sc.nextLine();
				System.out.println("Enter the destination");
				destination[i] = sc.nextLine();
				seatno++;
				
				
//				j = 0;
//				long temp = phonenumber[i];
//				while (j < temp) {
//					digit = temp % 10;
//					count++;
//					temp /= 10;
//					
//				}
				

			}
			
			timer();
//			if (count == 10) {
				System.out.println("Information fetched successfully");
				finalamount = 0;
				for (int i = 0; i < ticketnumber; i++) {
					
					if (age[i] > 0 && age[i] <= 5) {
						finalamount += 0;

					} else if (age[i] > 5 && age[i] < 60) {
						finalamount += 500;

					} else if (age[i] > 60) {
						discount = 500 * 20 / 100;
						discountamount = 500 - discount;

						finalamount += discountamount;
					}
					
//				}
//			}
//			else {
//				try {
//					throw new InvalidPhonenumberExceptions("Must contain 10 digit only");
//				} catch (InvalidPhonenumberExceptions e) {
//					e.printStackTrace();
//					return;
//				}
			}

			System.out.println("FINAL PAYABLE AMOUNT  :" + finalamount);

			System.out.println("Enter the final amount");
			payamount = sc.nextDouble();

			if (payamount == finalamount) {
				System.out.println("Please enter your upi pin");
				pin = sc.nextInt();
				if (pin == fixpin) {
					timers();
					for (int i = 0; i < ticketnumber; i++) {
						ticketid = random.nextInt(34567) + 1;
						seatno = random.nextInt(50) + 1;
						System.out.println("⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕TICKET BOOKED SUCCESSFULLY⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕");
						System.out.println("                                      ");
						System.out.println("TICKET ID             :" + ticketid);
						System.out.println("NAME                  :" + name[i]);
						System.out.println("AGE                   :" + age[i]);
						System.out.println("PHONE NUMBER          :" + phonenumber[i]);
						System.out.println("GENDER                :" + gender[i]);
						System.out.println("BOARDING POINT        :" + origin[i]);
						System.out.println("TICKET TYPE           :" + "NON AC");
						System.out.println("DESTINATION           :" + destination[i]);
						System.out.println("BUS NUMBER            :" + "BR0987A");
						System.out.println("SEAT NUMBER           :" + seatno);

						if (age[i] > 0 && age[i] <= 5) {
							System.out.println("PAID AMOUNT           :FREE TRAVEL");
						} else if (age[i] > 60) {
							System.out.println("DISCOUNT              :" + discount);
							System.out.println("PAID AMOUNT        :" + discountamount);
						} else {
							System.out.println("PAID AMOUNT           :" + 500);

						}
					}
				} else {
					System.out.println("Invalid Pin");
				}
			} else {
				System.out.println("Invalid Amount");
			}
		}
	}

}
