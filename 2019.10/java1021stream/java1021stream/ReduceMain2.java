package java1021stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceMain2 {

	public static void main(String[] args) {
		//Store 객체 4개를 저장할 수 있는 배열 생성 
		Store [] ar = new Store[4];
		ar[0] = new Store(1, "만보성", 53, "양천구 목동");
		ar[1] = new Store(2, "희래성", 23, "양천구 신정동");
		ar[2] = new Store(3, "홍보석", 75, "강서구 화곡동");
		ar[3] = new Store(4, "북경", 17, "강서구 발산동");
		//배열을 가지고 스트림 생성
		Stream <Store> stream = Arrays.stream(ar);
		
		//stream.filter((store)->{return store.getAddress().substring(0,3)
		//.equals("양천구");}).forEach(store -> System.out.println(store));
		
		stream.filter((store)->{
			//공백을 기준으로 분할 
			String [] ad = store.getAddress().split(" ");
			for(String imsi : ad) {
				if(imsi.contentEquals("목동")) {
					return true;
				}
			}
			return false;
				}).forEach(store -> System.out.println(store));
		}

	}


