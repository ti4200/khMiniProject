package city.info;

import cities.City;

public class CityInit {
	public void city_init(){
		City[] c = new City[16];
		
		c[0] = new City("리스본",5);
		c[1] = new City("방콕",10);
		c[2] = new City("도쿄",15);
		c[3] = new City("베이징",20);
		c[4] = new City("뉴델리",25);
		c[5] = new City("두바이",30);
		c[6] = new City("캔버라",35);
		c[7] = new City("카이로",40);
		c[8] = new City("상파울로",45);
		c[9] = new City("아테네",50);
		c[10] = new City("코펜하겐",55);
		c[11] = new City("베를린",60);
		c[12] = new City("런던",65);
		c[13] = new City("파리",70);
		c[14] = new City("뉴욕",75);
		c[15] = new City("서울",80);
		
		for(int i =0;i<c.length;i++){
			System.out.println(c[i].getName()+", "+c[i].getGrandCost());
		}
	}

	public static void main(String[] args) {
		new CityInit().city_init();
		

	}

}
