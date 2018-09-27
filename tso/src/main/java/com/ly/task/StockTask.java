package com.ly.task;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ly.dao.StockDao;
import com.ly.http.util.HttpKit;

@Component
public class StockTask {

	@Autowired
	private StockDao stockDao;
	
	
	@Scheduled(cron="0/5 * * * * ? ") 
	public void task01(){
		String url="https://hq.cmschina.com/market/json";
		
		
		Map<String, String> headers  = new HashMap<String, String>();
		headers.put("User-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36");
		headers.put("Accept","*/*");
		headers.put("Referer","https://y.qq.com/portal/player.html");
		headers.put("Accept-language","zh-CN,zh;q=0.9");
		headers.put("Cookie","yqq_stat=0; sajssdk_2015_cross_new_user=1; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%221660f51e07b31a-0b736491a58a07-661f1574-4953600-1660f51e07daf8%22%2C%22%24device_id%22%3A%221660f51e07b31a-0b736491a58a07-661f1574-4953600-1660f51e07daf8%22%2C%22props%22%3A%7B%7D%7D; pgv_pvi=7200084992; pgv_si=s4972853248; pgv_info=ssid=s3453417418; pgv_pvid=9791469305; ts_uid=6808134808; player_exist=1; yq_playschange=0; yq_playdata=; qqmusic_fromtag=66; ts_last=y.qq.com/porta");
		headers.put("Host", "c.y.qq.com");
		
		
		Map<String, String> params = new HashMap<String, String>();
		params.put("funcno","20000");
		params.put("version","1");
		params.put("stock_list","SZ%3A000009");
		params.put("field","1%3A2%3A3%3A4%3A5%3A6%3A7%3A8%3A9%3A10%3A11%3A12%3A13%3A14%3A15%3A16%3A17%3A18%3A19%3A22%3A24%3A25%3A26%3A27%3A31%3A29%3A30%3A45%3A46%3A21%3A23%3A58%3A48%3A50%3A51%3A52%3A78%3A80");
		params.put("timeStamp",System.currentTimeMillis()+"");
		
		
		String str = HttpKit.post(url,params,headers);
		String str2 = new String(str);
		System.out.println(str2);
		
	}
}
