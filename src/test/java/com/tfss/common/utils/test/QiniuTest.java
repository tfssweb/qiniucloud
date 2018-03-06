package com.tfss.common.utils.test;

import java.io.File;
import java.io.IOException;

import com.tfss.common.storage.QiniuStorage;
import com.tfss.common.storage.ThumbModel;
import com.tfss.common.utils.CommonUtil;

import junit.framework.TestCase;

public class QiniuTest extends TestCase {
	
	
	public void testImages() {
		
		//测试上传图片
		byte[] buff = CommonUtil.getFileBytes(new File("E://test.png"));
		String key = QiniuStorage.uploadImage(buff);
		System.out.println("key = " + key);
		
		//String key = "/default/all/0/a2fa2805356247278cbd568359a7bb0c.png";
		//测试下载图片
		String url = QiniuStorage.getUrl(key);
		System.out.println("url = " + url);
		
		//测试下载不同大小的图片
		url = QiniuStorage.getUrl(key,ThumbModel.THUMB_256);
		System.out.println("url = " + url);
		
	}
}

