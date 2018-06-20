package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */  int birdsOnBranch = 4;
        	int birdsFlewAway = 1;
        	int birdsLeft = birdsOnBranch - birdsFlewAway;
        	System.out.println("Birds Left: " + birdsLeft);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */ 
        	int birds = 6;
        	int nests = 3;
        	int birdsWithoutNests = birds - nests;
        	System.out.println("Birds Without Nests: " + birdsWithoutNests);

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
        	int raccoonsTotal = 3;
        	int raccoonsLeaving = 2;
        	int raccoonsLeft = raccoonsTotal - raccoonsLeaving;
        	System.out.println("Raccoons: " + raccoonsLeft);
        
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
        	int flowers = 5;
        	int bees = 3;
        	int moreFlowersThanBees = flowers - bees;
        	System.out.println("More Flowers than Bees: " + moreFlowersThanBees);
        

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
        	int lonelyPigeon = 1;
        	int notLonelyPigeon = 1;
        	int totalPigeons = lonelyPigeon + notLonelyPigeon;
        	System.out.println("Pigeons Eating Crumbs: " + totalPigeons);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
        	int owlsOnFence = 3;
        	int incomingOwls = 2;
        	int owlsOnFenceFinal = owlsOnFence + incomingOwls;
        	System.out.println("Owls On Fence: " + owlsOnFenceFinal);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
       
        */
        	int beaversWorking = 2;
        	int beaversLeaving = 1;
        	int beaversLeft = beaversWorking - beaversLeaving;
        	System.out.println("Beavers Still Working: " + beaversLeft);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
        	int toucansOnTree = 2;
        	int toucansIncoming = 1;
        	int toucansAdded = toucansOnTree + toucansIncoming;
        	System.out.println("Toucans: " + toucansAdded);
        

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
        	int squirrelInTree = 4;
        	int nutsInTree = 2;
        	int squirrelsThanNuts = squirrelInTree - nutsInTree;
        	System.out.println(squirrelsThanNuts + " Squirrels Than Nuts");

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
        	int quartersFound = 1;
        	int dimesFound = 1;
        	int nicklesFound = 2;
        	
        	float valueInQuarters = quartersFound * 0.25f;
        	float valueInDimes = dimesFound * 0.10f;
        	float valuesNicklesFound = nicklesFound * 0.05f;
        	
        	float totalMoneyFound = valueInQuarters + valueInDimes + valuesNicklesFound;
        	System.out.println("Mrs. Hilt Found $" + totalMoneyFound);
        	

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
        	
        int macAdamsBaked = 20;	
        int briersBaked = 18;
        int flannerysBaked = 17;
        
        int totalMuffinCount = macAdamsBaked + briersBaked + flannerysBaked;
        System.out.println("First Grade Total Muffins:" + totalMuffinCount);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        float yoyoPrice = 0.24f;
        float whistlePrice = 0.14f;
        float totalPrice = yoyoPrice + whistlePrice;
        System.out.println("Total Spent:" + totalPrice);
        
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows. How many marshmallows did she use
        altogether?
        */
        	int mMarsh = 10;
        	int lMarsh = 8;
        	int marshUsed = mMarsh + lMarsh;
        	System.out.println("Marshmallow: " + marshUsed);
        			
        
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int inchesOfSnow = 29;
        int schoolInchesOfSnow = 17;
        int moreInchesAtHilts = inchesOfSnow - schoolInchesOfSnow;
        System.out.println("More Inches at Hilts: " + moreInchesAtHilts);
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int hiltWallet = 10;
        int toyTruck = 3;
        int toyPencil = 2;
        int hiltWalletFinal = hiltWallet - toyTruck - toyPencil;
        System.out.println("Hilts money left $" + hiltWalletFinal);
       
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        
        int totalMarbles = 16;
        int lose = 7;
        int marblesLeft = totalMarbles - lose;
        System.out.println("Marbles Left: " + marblesLeft);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int meganSeashells = 19;
        int neededSeashells = 6;
        int seashellsNeeded = meganSeashells + neededSeashells;
        System.out.println("Seashells Needed: " + seashellsNeeded);
        
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
            int redBalloons = 8;
            int totalBalloons = 17;
            int greenBalloons = totalBalloons - redBalloons;
            System.out.println("Green Balloons: " + greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
            int booksOnShelf = 38;
            int booksMartha = 10;
            int booksNow = booksOnShelf + booksMartha;
            System.out.println("Books on Shelf: " + booksNow);
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
            int beeLegs = 6;
            int beeEight = 8;
            int beeCountLegs = beeLegs * beeEight;
            System.out.println("Bee Legs: " + beeCountLegs);
            
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
            float conePrice = 0.99f;
            float two = 2f;
            float conePriceofTwo = two * conePrice;
            System.out.println("2 cones for price of $" + conePriceofTwo);
            	
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
            int hiltRocks = 64;
            int rocksTotal = 125;
            int rocksNeeded = rocksTotal - hiltRocks;
            System.out.println("Rocks Needed : " + rocksNeeded);
            
            
            
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
            
          int hiltsMarbles = 38;
          int lostMarbles = 15;
          int leftMarbles = hiltsMarbles - lostMarbles;
          System.out.println("marbles left: " + leftMarbles);
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
          
          int concertTotal = 78;
          int stopForGas = 32;
          int milesLeft = concertTotal - stopForGas;
          System.out.println("Miles Left: " + milesLeft);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
          float timeShovelingSa = 1.50f;
          float timeShovelingSu = 0.75f;
          float timeTotal = timeShovelingSa + timeShovelingSu;
          System.out.println("Hours shoveled: " + timeTotal);
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
          int hotDogsBought = 6;
          float hotDogPrice = 0.50f;
          float hdTotalPrice = hotDogsBought * hotDogPrice;
          System.out.println("Hot Dog Price Total $" + hdTotalPrice);
        		  
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
          float pencilPrice = 0.07f;
          float walletHilt = 0.5f;
          float howMany = walletHilt / pencilPrice;
          System.out.println("How Many Pencils: " + howMany);
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
          int totalButter = 33;
          int orangeButter = 20;
          int redButter = totalButter - orangeButter;
          System.out.println("Red Butterflies: " + redButter);
        		 
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
         int walletKate = 1;
         float priceCandy = 0.54f;
         float changeKate = walletKate - priceCandy;
         System.out.println("Kates Change $" + changeKate);
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
         
         int markTrees = 13;
         int plantTree = 12;
         int totalTree = markTrees + plantTree;
         System.out.println("New Tree Total: " + totalTree);
        		 
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
         int xDays = 2;
         int hoursTillLeft = 24;
         int hoursTill = xDays * hoursTillLeft;
         System.out.println("Hours left: " + hoursTill);
        
        
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
         
         int kimCuz = 4;
         int gum = 5;
         int gumGive = gum * kimCuz;
         System.out.println("Gum Needed: " + gumGive);
        		 
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
         
         int danWallet = 3;
         int candyBarPrice = 1;
         int totalCandyBarPrice = danWallet - candyBarPrice;
         System.out.println("Money Left $" + totalCandyBarPrice);
        		 
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
         int boatsInLake = 5;
         int peopleInBoat = 3;
         int totalPeople = boatsInLake * peopleInBoat;
         System.out.println("total people in boats in lake: " + totalPeople);
        		 
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
            int ellenLego = 380;
            int lostLego = 57;
            int totalLego = ellenLego - lostLego;
            System.out.println("Legos left: " + totalLego);
            		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
            int arthMuffins = 25;
            int totalMuffins = 83;
            int neededMuffins = totalMuffins - arthMuffins;
            System.out.println("Total Muffins Need: " + neededMuffins);
            
            		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
            int willyCray =  1400;
            int lucyCray = 290;
            int willMoreCray = willyCray - lucyCray;
            System.out.println("Will has: " + willMoreCray);
            		
            
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
            int pageStick = 10;
            int mePageStick = 22;
            int totalStickers = pageStick * mePageStick;
            System.out.println("Total Stickers: " + totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
            int children = 8;
            int sharing = 96;
            int equalShare = sharing / children;
            System.out.println("Cupcakes Each: " + equalShare);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
           int gingerbreadCookies = 47;
           int inJar = 6;
           int cookiesNotInJar = gingerbreadCookies / inJar;
           
           System.out.println("Cookies not in Jar: " + cookiesNotInJar);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
          int cressantPreped = 59;
          int cressantGived = 8;
          int cressantLeft = cressantPreped / cressantGived;
         
          System.out.println("Croissants Left: " + cressantLeft);
          
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
            int oatmealCookies = 276;
            int oatmealTray = 12;
            int totalTray = oatmealCookies / oatmealTray;
            System.out.println("Trays: " + totalTray);
            		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
            int pretzels = 480;
            int oneServe = 12;
            int finalSize = pretzels / oneServe;
            System.out.println("Pretzels: " + finalSize);
            		
            	
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
            
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
            int carrotB = 74;
            int peopleB = 12;
            int servingsB = carrotB / peopleB;
            System.out.println("Carrots left: " + servingsB);
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
           int totalBear = 98;
           int totalShelf = 7;
           int totalBearShelf =  totalBear / totalShelf;
           System.out.println("ShelvesNeeded: " + totalBearShelf);
        		   
            
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
           int album = 20;
           int picturesN = 480;
           int totalAlbums = picturesN / album;
           System.out.println("Albums Needed: " + totalAlbums);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
            int cards = 94;
            int boxes = 8;
            int totalBox = cards / boxes;
            System.out.println("Boxes Needed: " + totalBox);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
            int shelvesR = 10;
            int booksR = 210;
            int shelvesContain = booksR / shelvesR;
            System.out.println("Shelves containing: " + shelvesContain + " books");
            

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
            int kresantBaked = 17;
            int sevenG = 7;
            int totalT = kresantBaked / sevenG;
            System.out.println("Have Each: " + totalT);
            
            int kK = 17;
            int nB = 7;
            int fC = kK / nB;
            System.out.println("More Flowers than Bees: " + fC);
            
            int gunAmmoMax = 32;
            int gunCap = 15;
           
            
            
            
            	if(gunMaxAmmo >= 15) 
            		return gunAmmoMax(gunAmmoMax - 15);
            	
            	
            
            
            
            System.out.println("More Flowers than Bees: " + gunReloadCount);
            
            
	}

}
