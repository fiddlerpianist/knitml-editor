

# The Header #
Each pattern has a header section which contains information such as the name of the pattern, a description, and the author. It also contains information about what is needed to knit the pattern (needles, yarn, stitch holders, etc.)

Here is an example header:
```
Pattern name: "Simple Pattern"
Description: "A simple pattern for demonstration purposes"
Gauge: 5 st/in, 7 row/in
Author: "Joe Smith"
Yarn:
	25 g of "Terri's Handspun" (worsted weight)
Needles:
	Size 1 US circular
		Needle-One "Needle One"

```

The header is optional, but if you need to specify yarn or needles used later in the pattern, they must be put in the header. If the header is present, the pattern name and description (in that order) are required.

# The Directions #
## Casting On ##
Most patterns start with a cast on. For To cast on 20 stitches, for example, you would type:
```
Cast on 20 sts
```
```
Cast on 20
```
or even:
```
CO 20
```
If you use more than one needle in the pattern, you first need to indicate which needles to start with:
```
Use Needle-One
```
If it's obvious to the knitter which needle to use and you are just telling the computer (computers are incredibly unintelligent, after all), you can put it in parentheses:
```
(Use Needle-One)
```
When you use the two directions next to each other:
```
(Use Needle-One)
Cast on 20 sts
```
this will look something like "Using Needle One, cast on 20 stitches" when the final (i.e., rendered) pattern is produced.

## Rows ##
Directions which describe how to work stitches occur within a row. Here is an example:
```
Row 1: k to end
Row 2: p to end
```

You don't have to specify row numbers; they will be inferred if you omit them:
```
Row: k to end
Row: p to end
```
These rows will be treated as rows 1 and 2, respectively.

You can reset this row count to 1 by specifying a new row 1:
```
Row: k to end
Row: p to end
Row: knit to end
Row 1: purl to end
Row: knit to end
```
These rows will be treated as rows 1, 2, 3, 1, and 2, respectively.

You can force a row to have no number:
```
Next Row: k to end
```

You can specify the expected row side (i.e., right / wrong side):
```
Row RS: k to end
Row WS: p to end
```
Or just have the program render the next side:
```
Row (state side): knit to end
```

You can repeat directions within the row:
```
Row: repeat [k2, p2] to end
Row: repeat [k2, p2] to 4 before end, p4
```
And ensure that the number of stitches you're expecting at the end of a row matches the actual number of stitches:
```
Row: repeat [k2tog, p2tog] to end, state 10 sts
```

You can define short rows:
```
Short Row: k10, turn (state 10 unworked sts)
Short Row: k10
```

You can knit in the round and specify rows as rounds:
```
Begin knitting in the round
Round: k to end
Round: k to end
```
Or you can always refer to them as rows:
```
Begin knitting in the round
Row: k to end
Row: k to end
```

There are other things that you can do with rows that aren't covered here. See the examples for further usage.

## Instructions ##
An instruction is a group of rows that go together. All instructions have names. This instruction's name is Stockinette.
```
Instruction Stockinette:
	Row: knit to end
	Row: purl to end
```
If you want to give the instruction a label (for rendering), add it after the name:
```
Instruction Stockinette "St st":
	Row: knit to end
	Row: purl to end
```


When rows are defined within an instruction, you can define row number ranges:
```
Instruction Sunny-Day:
	Row 1,3,5-7: knit to end
	Row 2: purl to end
	Row 4: p2tog, p to end
```
or odd / even designations (if you specify how many rows are in the instruction):
```
Instruction Sunny-Day (10 rows):
	Row 1 and all odd rows: knit to end
	Row 2 and all even rows: purl to end
```
or even something complex like this:
```
Instruction Sunny-Day (20 rows):
	Row 1,3,5-7 and odd rows: knit to end
	Row 2: purl to end
	Row 4: p2tog, p to end
	Row 8 and even rows: purl to end
```
As a pattern designer, you want to be careful about preserving readability for your users, so use such complex constructions carefully and judiciously.

You can repeat previously defined instructions:
```
Instruction Stockinette "St st":
	Row: knit to end
	Row: purl to end

Repeat Stockinette 3 more times
```
```
Instruction Stockinette "St st":
	Row: knit to end
	Row: purl to end

Repeat Stockinette for 4.5 in
```
```
Instruction Decreasing-Stockinette:
	Row: k2tog, knit to end
	Row: p2tog, purl to end

Repeat Decreasing-Stockinette until 10 st remain
```

### Special Consideration for Instructions ###
Instructions are terminated **by a blank line**. Rows 1 and 2 are part of the Stockinette instruction, but row 3 is not.
```
Instruction Stockinette:
	Row 1: knit to end
	Row 2: purl to end

Row 3: k2tog 2 times, k to end
```
If, however, you were to do this:
```
Instruction Stockinette:
	Row 1: knit to end
	Row 2: purl to end
Row 3: k2tog 2 times, k to end
```
Row 3 would still be part of the instruction, which is probably not what you want. Formatting the pattern with Control-Shift-F here would cause the Row 3 definition to indent to the level of rows 1 and 2, so sometimes formatting can help you discover errors.