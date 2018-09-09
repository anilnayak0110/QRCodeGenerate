package com.anilnayak.qrcode;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * QRCode Generator
 *
 */
public class QRCodeGenerator {
	private String QR_CODE_PATH = "C:\\Users\\LKU\\Documents\\QR_CODE_SERVER\\";
	public String writeQRCode(PaytmRequestBody paytmRequestBody) throws Exception {
		String QrCode = QR_CODE_PATH+paytmRequestBody.getUsername()+" .QR_CODE.png";
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix matrix = writer.encode(
				paytmRequestBody.getUsername() + "\n" + paytmRequestBody.getAccountNo() + "\n"
						+ paytmRequestBody.getAccountType() + "\n" + paytmRequestBody.getMobileNo(),
				BarcodeFormat.QR_CODE, 350, 350);
		Path path = FileSystems.getDefault().getPath(QrCode);
		MatrixToImageWriter.writeToPath(matrix,"PNG", path);
		return "QR Code is generated successfully";
	}

	public static void main(String[] args) throws Exception {
		QRCodeGenerator generator = new QRCodeGenerator();
		System.out.println(generator.writeQRCode(new PaytmRequestBody("anil","8121915678", "personal", "34567890234")));
	}
}
