package zhang;

import java.util.ArrayList;
import java.util.HashMap;

public class Status {
	private ArrayList<String> zhuangTai;// 用来保存随机状态
	private HashMap<String, ArrayList<String>> tiMu;// 用来保存随机状态和选项

	public Status() {
		// 初始化值
		zhuangTai = new ArrayList<String>();
		tiMu = new HashMap<String, ArrayList<String>>();
		// 情况添加
		String qingKuang = "没有接到女朋友电话";
		String qingKuang1 = "没有陪女朋友吃饭";
		String qingKuang2 = "约会迟到。。。";
		
		zhuangTai.add(qingKuang);
		zhuangTai.add(qingKuang1);
		zhuangTai.add(qingKuang2);
		// 添加选项
		String xuanXiang1 = "我手机静音了";
		String xuanXiang2 = "我在打游戏";
		String xuanXiang3 = "我在给你买东西";
		String xuanXiang4 = "我在工作";
		ArrayList<String> temp = new ArrayList<String>();
		// 生成中间变量
		temp.add(xuanXiang4);
		temp.add(xuanXiang3);
		temp.add(xuanXiang2);
		temp.add(xuanXiang1);
		
		String xuanXiang11 = "我有事忘了";
		String xuanXiang22 = "我在上课";
		String xuanXiang33 = "我在给你买东西";
		String xuanXiang44 = "我在打游戏";
		tiMu.put(qingKuang, temp);
		
		ArrayList<String> temp1 = new ArrayList<String>();
		// 生成中间变量
		temp1.add(xuanXiang44);
		temp1.add(xuanXiang33);
		temp1.add(xuanXiang22);
		temp1.add(xuanXiang11);
		// 将情况和选项放入Hash表
		tiMu.put(qingKuang1, temp1);
		
		String xuanXiang111 = "我在打游戏";
		String xuanXiang222 = "我在洗衣服";
		String xuanXiang333 = "我在睡觉";
		String xuanXiang444 = "我在查询去哪里玩";
		ArrayList<String> temp2 = new ArrayList<String>();
		temp2.add(xuanXiang444);
		temp2.add(xuanXiang333);
		temp2.add(xuanXiang222);
		temp2.add(xuanXiang111);
		tiMu.put(qingKuang2, temp2);
	}

	public ArrayList<String> getZhuangTi() {
		return zhuangTai;
	}

	public void setZhuangTai(ArrayList<String> zhuangTai) {
		this.zhuangTai = zhuangTai;
	}

	public HashMap<String, ArrayList<String>> getTiMu() {
		return tiMu;
	}
}
