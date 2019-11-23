module Lib
    ( generateList,
      myMap,
      myFilter
    ) where

-- Takes in an integer and returns a list of integers
generateList :: Int -> [Int]
generateList num
  | num < 0 = [] -- when num is less than 0 return an empty list
  | otherwise = generateList (pred num) ++ [num] -- otherwise recurse and prepend the number

{-
generateList 5
generateList 4 ++ 5
generateList 3 ++ 4 ++ 5
generateList 2 ++ 3 ++ 4 ++ 5
generateList 1 ++ 2 ++ 3 ++ 4 ++ 5
generateList 0 ++ 1 ++ 2 ++ 3 ++ 4 ++ 5
[] ++ 0 ++ 1 ++ 2 ++ 3 ++ 4 ++ 5
[0] ++ 1 ++ 2 ++ 3 ++ 4 ++ 5
[0, 1] ++ 2 ++ 3 ++ 4 ++ 5
[0, 1, 2] ++ 3 ++ 4 ++ 5
[0, 1, 2, 3] ++ 4 ++ 5
[0, 1, 2, 3, 4] ++ 5
[0, 1, 2, 3, 4, 5]
-}

-- Takes a function that turns a into b, a list of a and returns a list of b
myMap :: (a -> b) -> [a] -> [b]
myMap _ [] = [] -- If the list is empty return an empty list
myMap f (x:xs) = f x : myMap f xs -- Call f on the first element of the list and then recurse using the rest of the list

-- Takes a function that returns a boolean given a value of a, a list of a and returns a new list of a
myFilter :: (a -> Bool) -> [a] -> [a]
myFilter _ [] = [] -- If the list is empty return an empty list
myFilter f (x:xs)
  | f x = x : myFilter f xs -- If calling f on x is true append it and call filter on the rest
  | otherwise = myFilter f xs -- Otherwise just call filter on the rest
