package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = 97; 			// ¹®ÀÚ ÄÚµå´Â Á¤¼ö°ª.
		
		// µÑ´Ù 'a' Ãâ·Â
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		// ¹®ÀÚ ÄÚµå Á¤¼ö°ªÀ» Ãâ·ÂÇÏ·Á¸é? -> int ·Î Ä³½ºÆÃ ÇÑ´Ù. ÇÏÁö¸¸ µÑ´Ù 97·Î ³ª¿È
	//	System.out.printf("c1 = %d\n" , c1); // char ÇüÀº %d°¡ ¾Æ´Ô ¿À·ù ÅÍÁü
		System.out.printf("c1 = %d\n" , (int)c1);
		System.out.printf("c2 = %d\n" , (int)c2);
		
		c1 = (char)(c1 + 1); // µ¡¼À ¿¬»ê °¡´É. ¿¬»ê°á°ú ´ëÀÔÇÒ¶§´Â casting ÇÊ¿ä
		System.out.println("c1 =" + c1);
		
		c1++; 		// ++¿¬»êÀº c1 = c1 + 1 , char Çü castingÀÌ ÇÊ¿ä ¾ø½À´Ï´Ù.(int ¸®ÅÍ·² »ç¿ëÇÑ °è»êÀÌ ¾Æ´Õ´Ï´Ù.)
		System.out.println("c1 =" + c1); // ++ÀÌ À§¿¡°Åº¸´Ù ÈÎ¾À ÆíÇÏ´Ù.
		
		// ÇÑ±Û ¹®ÀÚ Å×½ºÆ® : ÇÑ±Û ¹®ÀÚ ÄÚµå´Â 10Áø¼ö°ªÀ» 44032 ~ 55203 , 16Áø¼ö (2Áø¼ö) ac00 ~ d7a3
		char h1 ='°¡';
		char h2 =44032;   //
		char h3 ='\uac00'; 	// \\ u Ç¥½Ã´Â 16Áø¼ö À¯´ÏÄÚµå Ç¥½Ã, ac00Àº 16Áø¼ö °ª
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n" , (int)h1);
		System.out.printf("h2 = %d\n" , (int)h2);
		System.out.printf("h3 = %d\n" , (int)h3);
		
		
		h1++;
		System.out.println("h1 =" + h1);
		
		h1++;
		System.out.println("h1 =" + h1);
		
		//ÇÑ±ÛÀÇ ¸¶Áö¸· ¹®ÀÚ
		char h4 = 55203;	// 10Áø¼ö Ç¥Çö
		char h5 = '\ud7a3'; // 16Áø¼ö Ç¥Çö, ÆR
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4 = " + h4); // ÇØ´çµÇ´Â ¸ð¾çÀÌ ¾ø¾î¼­ ? ³ª¿È
		
		h5--;
		System.out.println("h5 = " + h5); // ÆQ ³ª¿È
		System.out.println('H'+'e'+'l'+'l'+'o'); // °¢ ¹®ÀÚ ÄÚµå°ªÀ» ³ª¿­ÇÑ °á°ú°¡ ³ª¿Â´Ù
	}
	// charÀÌ ¸ð¿©¼­ ÇÑÁÙ·Î ³ª¶õÈ÷ ³ª¿­ÇÏ¸é -> ¹®ÀÚ¿­ÀÌ µÈ´Ù. "Hello" ´Â 'H' 'e' 'l' 'l' 'o' 
}
/*  
 * 		±âº»Çü½Ä µ¥ÀÌÅÍ : ¹®ÀÚÇü char
 * 			¹®ÀÚ µ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â 2¹ÙÀÌÆ® Çü½Ä . Á¤¼ö°ª 0~65535 ¹üÀ§ ÀúÀåµµ °¡´É
 * 			ÄÄÇ»ÅÍ¿¡¼­ ´Ù·ç´Â ¹®ÀÚ´Â ¹®ÀÚ ÄÚµå·Î Ã³¸®µÇ´Âµ¥ ÄÚµå´Â Á¤¼ö°ª ÀÓ.
 * 			¹®ÀÚ µ¥ÀÌÅÍ´Â '' ±âÈ£¸¦ »ç¿ëÇÔ. (''¾È¿¡ ¹®ÀÚ ÇÑ°³¸¸ °¡´É)
 * 
 * 			¿µ¹®ÀÚ , ¼ýÀÚ , Æ¯¼ö¹®ÀÚ´Â ASCII ÄÚµå·Î Ç¥ÇöµË´Ï´Ù.
 * 			¿µ¹®ÀÚ , ¼ýÀÚ , Æ¯¼ö¹®ÀÚ ¿ÜÀÇ ´Ù±¹¾î ¹®ÀÚ´Â ¹®ÀÚ¸¦ Ã³¸®ÇÏ´Â ÀÎÄÚµù ¹æ½Ä¿¡ µû¶ó
 * 			¹®ÀÚ ÄÚµå°ªÀÌ ´Ù¸¨´Ï´Ù. ±¹Á¦È­ ÀÎÄÚµùÀ¸·Î utf-8 ¹æ½ÄÀ» ¸¹ÀÌ »ç¿ëÇÑ´Ù.
 * 
 * 
 * 
 * 			°£ : ¤¡ ¤¿ ¤¤ (ÃÊ¼º , Áß¼º, Á¾¼º °¢°¢¿¡ ÄÚµå°ªÀ¸·Î Á¶ÇÕÇÏ´Â Á¶ÇÕÇü)
 * 			ÇÑ±Û¿¡¼­ ³ª¿Ã ¼ö ÀÖ´Â ¸ðµç ÃÊ¼º/Áß¼º/Á¾¼ºÀÇ ¸ðµç Ç¥ÇöÀ» ¸¸µé¾î¼­ °¢°¢ÀÇ ÄÚµå°ªÀ» ºÎ¿©ÇÏ´Â ¿Ï¼ºÇü
 * 
 */