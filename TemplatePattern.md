
```
-- This is a template knitting pattern. Delete what you don't need!
--
-- Two dashes (--) indicates a comment to (and including) the end of the line.
-- You can toggle the comment on the line you're on by pressing Control-/ (Mac: Command-/) 
-- Comments won't be processed by the software. They also won't be visible in the Pattern View.

/* Comments can also be written like this, split over multiple lines.
 When you write comments like this, you can fold up the entire comment
 by clicking on the little +/- with a circle in it in the left-hand margin
 and it will fold up or expand. Note, however, that
 the end of the line IS processed at the end of the comment. Sometimes
 this makes a difference in the pattern, since the ends of lines are important
 for the software to process in some situations. */ 

--NO PARAGRAPHS /* Uncomment this line if you don't want line breaks to indicate paragraphs */

/*-- This is the header, which contains information about the
 knitting pattern (name, description, etc.). The header is optional,
 but if you require anything in the header, you MUST provide a pattern
 name and a description for your pattern (in that order).
 */ 
Pattern name: "My Scarf"
Description: "A long-ish scarf for a long-ish guy"
-- The rest of the header elements are optional and can appear in any order.
Language: English /* English, French, Spanish, or the 2-letter language code */ 
-- Some information requires the values to be in quotes, such as copyright.
Author: "Joe Smith"
Copyright: "Copyright 2012, Joe Smith"
Dimensions: "76 in. long, 4 in. wide"
Techniques: "knitting" "knitting with toes"
-- It's important to specify the gauge if you want to be able to transform the pattern to a different gauge. 
Gauge: 5 st/in, 7 rows/in /* Right now, there is only one gauge you can specify per pattern */ 
--
-- There are many options for specifying yarn.
-- Giving a yarn an ID is important if you want to be able to refer to it later in the pattern.
Yarn:
-- From the basics...
	50 g of DK weight in color Blue named A /* the yarn ID is 'A' */ 
	-- ...to the very complete...
	50 g (25 m) of "Sloppy Joe's" "Alpaca" "Jaunty" # 3199 (sport weight, ball weight:  100 g, ball length:  50 m, yarn thickness:  7 wpi) in color Red named B /* the yarn ID is 'B'*/ 
	-- ...to multiple colors per yarn
	--		"Sloppy Joe's" "Mohair Surprise"
	--			50 g in "Red Velvet": RV /* The yarn ID is 'RV' */
	--			50 g in Yellow: Y /* The yarn ID is 'Y'  */
	--			in Green (335): G /* The yarn ID is 'G' */
Needles:
-- Here are some ways to specify needles
	Size 4.5 mm circulars brand Knitpicks, 24 in
		Circ-One "Circular Needle 1"
		Circ-Two "Circular Needle 2"
	Size 7 US dpns
		DPN-One "DPN 1" /* The needle ID is 'DPN-One' and its label is "DPN 1" */ 
		DPN-Two "DPN 2" /* The needle ID is 'DPN-Two' and its label is "DPN 2" */ 
		DPN-Three "DPN 3" /* The needle ID is 'DPN-Three' and its label is "DPN 3" */ 
		DPN-NotUsed /* Include this last needle so that the Pattern View will read '4 DPNs',
		               since you always have one DPN without stitches on it */ 
Stitch Holders:
	A "Holder A" /* The stitch holder ID is 'A' and its label is "Holder A" */ 
	B "Holder B" /* The stitch holder ID is 'B' and its label is "Holder B" */ 
	-- Once you've finished with the header, you indicate to the editor that this is the beginning of the directions with one or more blank lines.  


/* Here is where you put the pattern directions.
 You can press Control-Space (Mac: Command-Space) at any point to see suggestions for directions.
 Almost all patsterns start with a cast on. If you define more than one needle,
 you have to tell the software which needle or needles to start with. */ 
(Use Circ-One) /* You put it the Use statement in parentheses if you want to tell
                    the software to use the needle but not the knitter */ 
Cast on 20 sts /* If you follow a Use needle statement in parentheses with a cast on statement,
                  the Pattern View will combine the two into a single statement. */ 

-- It's often helpful to add explanatory notes to your directions. They go in quotes.
"You're going to be working in Garter Stitch (if you're familiar with that term)."

-- Put rows that go together in an Instruction. That groups them together so that
-- they can be considered together (for repetitions, formatting, and charting).
-- You don't have to give it a label, but if you do, the name will show up in the Pattern View.
Instruction Garter-Stitch "Garter Stitch" (14 rows): /* The instruction's ID is 'Garter-Stitch' and its label is "Garter Stitch" */ 
-- This shows all the different ways you can express row numbers in an instruction...
-- but it's a silly way to express garter stitch :)   
	Row 1 RS: k to end /* RS indicates right side of work */ 
	Rows 2, 4 WS: k to end /* WS indicates wrong side of work */ 
	Row 3: k to end
	Rows 5-8, 10: k to end
	Rows 9 and odd rows: k to end
	Row 12 and even rows WS: k to end
	/* The blank line at the end of the instruction is really important; it means the instruction is over.
	If you were to put another row after a line break, it would NOT be part of that instruction. This
	can get a little confusing, but if you press Control-Shift-F, it will format the pattern, and any
	rows which fall outside of the instruction will appear at a different indent level than rows
	within the instruction, making this clearer. */ --

-- You can repeat instructions; just use the ID.
Repeat Garter-Stitch 6 more times /* That's 7 times total because the original definition is not included in this repeat count. */ 
--Repeat Garter-Stitch for 12 in /* That's 14 inches total, because the original definition is not included in this measurement and the row gauge is 7 row/in. */
--Repeat Garter-Stitch for desired length /* A whimsical way to repeat */
State stitches /* This will state how many sts are currently being worked in the Pattern View... */ 
--State 20 sts /* So will this, but if you put a number here it will ensure that's the right number */
/* A blank line here (i.e. in the directions but not within an instruction) means that this is the end of the section.
   This will look like a paragraph in the Pattern View UNLESS the "NO PARAGRAPHS" line at the top of the pattern is uncommented */ 

-- Here's how you can specify knitting-in-the round, and how you can switch to different needles.
Join in round
Arrange as follows:
Circ-One: 0, DPN-One: 6, DPN-Two: 6, DPN-Three: 8 /* You have to include the needle the stitches were on (Circ-One),
                                                     so that it knows to transfer these stitches to the other needles.
                                                     Don't worry; Circ-One won't show up in the Pattern View. */ 

"Now you're going to be working Garter Stitch in the round... with two colors!"
Instruction Two-Color-Garter-Stitch:
	Row with A: k to end /* Note that the Pattern View will state the color, the starting row number, AND as a Round automatically */ 
	Row with B: p to end
	-- Here's that darn blank line again...

Repeat Two-Color-Garter-Stitch for 66 in

Row: BO all sts /* Note how this shows you the row number in the Pattern View, even though it's
                   not specified here */
```