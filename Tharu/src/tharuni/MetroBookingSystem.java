package tharuni;

import java.util.Scanner;
public class MetroBookingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String reg_username=null,reg_password=null,log_username=null,log_password=null;
		int source=0,destination=0,tickets=0,fare=0,totalstations=0;
		boolean b=true;
		double balance=0.0;
		while(true) {
			System.out.println("1.Register\n2.Login\n3.EXIT\n");
			System.out.print("Enter option: ");
			int ch=sc.nextInt();
			
			if(ch==1) {
					System.out.println("==========REGISTER==========");
					System.out.println();
			        System.out.print("Enter User Name: ");
					reg_username=sc.next();
					System.out.print("Create Password: ");
					reg_password=sc.next();
					System.out.print("Re Enter Password: ");
					String Repassword=sc.next();
					if(reg_password.equals(Repassword)) {
						System.out.println();
						System.out.println("Registration Successful.....Please Login");}
					else
						System.out.println("Password Doesnot Match");
					
			}
			else if(ch==2) {
				System.out.println("==========LOGIN==========");
				System.out.println();
				System.out.print("Enter User Name: ");
				log_username=sc.next();
				System.out.print("Enter Password: ");
				log_password=sc.next();
				if(reg_username.equals(log_username) && reg_password.equals(log_password)) {
					System.out.println();
					System.out.println("LOGIN Successful");
					System.out.println();
					while(true) {
						System.out.println("OPTIONS :\n1.Recharge Metro Card\n2.Book Tickets\n3.View Balance\n4.History\n5.logout\n");
						System.out.println("Select the option: ");
						int log_ch=sc.nextInt();
						if(log_ch==1) {
							System.out.println("==========Recharge Metro Card==========");
							System.out.println();
							System.out.print("Enter Amount: ");
							double amount=sc.nextDouble();
							balance+=amount;
							System.out.println("Balance Updated");
							System.out.println("Available Balance: "+balance);
							
							}
						else if(log_ch==2) {
							System.out.println("==========Book Tickets==========");
							System.out.println();
							System.out.println("Select Metro Line\n1.RED Line(L.B.Nagar<->Miyapur)\n2.BLUE Line(Nagole<->Raidurg)\n3.GREEN Line(JBS<->MGBS)\n");
							int bt_ch=sc.nextInt();
							switch(bt_ch) {
								case 1:
									System.out.println("============STATIONS============ \n1. Miyapur\r\n"
											+ "2. JNTU College\r\n"
											+ "3. KPHB Colony\r\n"
											+ "4. Kukatpally\r\n"
											+ "5. Balanagar\r\n"
											+ "6. Moosapet\r\n"
											+ "7. Bharat Nagar\r\n"
											+ "8. Erragadda\r\n"
											+ "9. ESI Hospital\r\n"
											+ "10. SR Nagar\r\n"
											+ "11. Ameerpet \r\n"
											+ "12. Punjagutta\r\n"
											+ "13. Irrum Manzil\r\n"
											+ "14. Khairatabad\r\n"
											+ "15. Lakdikapul\r\n"
											+ "16. Assembly\r\n"
											+ "17. Nampally\r\n"
											+ "18. Gandhi Bhavan\r\n"
											+ "19. Osmania Medical College\r\n"
											+ "20. MG Bus Station \r\n"
											+ "21. Malakpet\r\n"
											+ "22. New Market\r\n"
											+ "23. Musarambagh\r\n"
											+ "24. Dilsukhnagar\r\n"
											+ "25. Chaitanyapuri\r\n"
											+ "26. Victoria Memorial\r\n"
											+ "27. LB Nagar (terminal)");
									System.out.print("Enter Source station Number:");
									source=sc.nextInt();
									System.out.print("Enter Destination Station Number:");
									destination=sc.nextInt();
									totalstations=Math.abs(destination-source);
									System.out.print("Enter no.of Tickets: ");
									tickets=sc.nextInt();
									break;
									
								case 2:
									System.out.println("============STATIONS============ \n1. Nagole (terminal)\r\n"
											+ "2. Uppal\r\n"
											+ "3. Stadium\r\n"
											+ "4. NGRI\r\n"
											+ "5. Habsiguda\r\n"
											+ "6. Tarnaka\r\n"
											+ "7. Mettuguda\r\n"
											+ "8. Secunderabad East\r\n"
											+ "9. Parade Ground \r\n"
											+ "10. Paradise\r\n"
											+ "11. Rasoolpura\r\n"
											+ "12. Prakash Nagar\r\n"
											+ "13. Begumpet\r\n"
											+ "14. Ameerpet \r\n"
											+ "15. Taruni Madhura Nagar\r\n"
											+ "16. Yusufguda\r\n"
											+ "17. Road No 5 Jubilee Hills\r\n"
											+ "18. Jubilee Hills Check Post\r\n"
											+ "19. Peddamma Gudi\r\n"
											+ "20. Madhapur\r\n"
											+ "21. Durgam Cheruvu\r\n"
											+ "22. HITEC City\r\n"
											+ "23. Raidurg (terminal)");
									System.out.print("Enter Source station Number:");
									source=sc.nextInt();
									System.out.print("Enter Destination Station Number:");
									destination=sc.nextInt();
									totalstations=Math.abs(destination-source);
									System.out.print("Enter no.of Tickets: ");
									tickets=sc.nextInt();
									break;
									
									case 3:
										System.out.println("============STATIONS============ \n1. JBS Parade Ground (terminal)\r\n"
												+ "2. Secunderabad West\r\n"
												+ "3. Gandhi Hospital\r\n"
												+ "4. Musheerabad\r\n"
												+ "5. RTC Cross Roads\r\n"
												+ "6. Chikkadpally\r\n"
												+ "7. Narayanguda\r\n"
												+ "8. Sultan Bazaar\r\n"
												+ "9. MG Bus Station (terminal)");
										System.out.print("Enter Source station Number:");
										source=sc.nextInt();
										System.out.print("Enter Destination Station Number:");
										destination=sc.nextInt();
										totalstations=Math.abs(destination-source);
										System.out.print("Enter no.of Tickets: ");
										tickets=sc.nextInt();
										break;
									
								
								
							}
							if(totalstations<=5) {
								fare+=(10+((totalstations)*5)*tickets);
							}
							else {
								fare+=35*(tickets);
							}
							System.out.println("TOTAL FARE: "+fare);
							System.out.println();
							System.out.println("Do You want to confirm Tickets(yes/no): ");
							String ct=sc.next();
							if(ct.equals("yes")) {
								if(balance>=fare) {
									balance-=fare;
									System.out.println("       TICKETS BOOKED SUCCESFULLY       ");
									
								}
								else {
									System.out.println("Insufficient Balance");
									b=false;}
							}
							else if(ct.equals("no")) {
								System.out.println("Booking Unsuccessful");
							}
							
							
							
						}
					else if(log_ch==3) {
						System.out.println("=============VIEW BALANCE=============");
						System.out.println("Available Balance= "+balance);
						}
					else if(log_ch==4) {
						System.out.println("==============HISTORY===============");
						if(b==true) {
						System.out.println("Your Last journey was from station"+source+"to"+destination);
						System.out.println("AMOUNT PAID: "+fare);}
						else
							System.out.println("NO HISTORY");
					}
					else if(log_ch==5) {
						System.out.println("Logging out..........");
						System.out.println();
						System.out.println("LOGOUT successful");
						break;
					}
						}
						
						
				}
					
				else
					System.out.println("Usesname and Password Doesnot Exists");
				}
			else if(ch==3) {
				break;
			}

	}
	}
//ut
}

