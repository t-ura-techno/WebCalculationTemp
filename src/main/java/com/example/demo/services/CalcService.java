
package com.example.demo.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	// 足し算のメソッド
	public String calculateAdd(String addNumA, String addNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(addNumA);
		BigDecimal numB = new BigDecimal(addNumB);

		// ②.NumAとNumBを足し算
		BigDecimal addNumResult = numA.add(numB);

		// ③.②の結果をStringに変換
		String Result = addNumResult.toString();

		// ④.③を呼び出し元に返す
		return Result;

	}

	// 引き算のメソッド
	public String calculateSubtract(String subtractNumA, String subtractNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(subtractNumA);
		BigDecimal numB = new BigDecimal(subtractNumB);

		// ②.NumAとNumBを引き算
		BigDecimal subtractNumResult = numA.subtract(numB);

		// ③.②の結果をStringに変換
		String result = subtractNumResult.toString();

		// ④.③を呼び出し元に返す
		return result;

	}

	// かけ算のメソッド
	public String calculateMultiply(String multiplyNumA, String multiplyNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(multiplyNumA);
		BigDecimal numB = new BigDecimal(multiplyNumB);

		// ②.NumAとNumBをかけ算
		BigDecimal multiplyNumResult = numA.multiply(numB);

		// ③.②の結果をStringに変換
		String Result = multiplyNumResult.toString();

		// ④.③を呼び出し元に返す
		return Result;

	}

	// 割り算のメソッド(
	public String calculateDivide(String divideNumA, String divideNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(divideNumA);
		BigDecimal numB = new BigDecimal(divideNumB);

		try {
			// ②.NumAとNumBを割り算
			BigDecimal divideNumResult = numA.divide(numB, 7, RoundingMode.HALF_UP);
			// ③.②の結果をStringに変換
			String Result = divideNumResult.toString();

			// ④.③を呼び出し元に返す
			return Result;
		} catch (Exception e) {
			// 0除算がされた際にエラーをキャッチして例外処理
			return "0除算がされたため、計算不可でした。";
		}

	}

	// 余りのメソッド
	public String calculateRemainder(String remainderNumA, String remainderNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(remainderNumA);
		BigDecimal numB = new BigDecimal(remainderNumB);

		try {
			// ②.NumA÷NumBの余りを求める
			BigDecimal divideNumResult = numA.remainder(numB);
			// ③.②の結果をStringに変換
			String Result = divideNumResult.toString();

			// ④.③を呼び出し元に返す
			return Result;
		} catch (Exception e) {
			// 0除算がされた際にエラーをキャッチして例外処理
			return "0除算がされたため、計算不可でした。";
		}

	}

	// 累乗のメソッド
	public String calculatePow(String powNumA, String powNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(powNumA);
//		BigDecimal numB = new BigDecimal(powNumB);

		// ②.NumA^NumBを求める
		BigDecimal divideNumResult = numA.pow(Integer.parseInt(powNumB));
		// ③.②の結果をStringに変換
		String Result = divideNumResult.toString();

		// ④.③を呼び出し元に返す
		return Result;
	}

}
