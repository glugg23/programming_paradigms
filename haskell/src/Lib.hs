module Lib
    ( generateList,
      myMap,
      myFilter
    ) where

generateList :: Int -> [Int]
generateList num
  | num < 0 = []
  | otherwise = generateList (pred num) ++ [num]

myMap :: (a -> b) -> [a] -> [b]
myMap _ [] = []
myMap f (x:xs) = f x : myMap f xs

myFilter :: (a -> Bool) -> [a] -> [a]
myFilter _ [] = []
myFilter f (x:xs)
  | f x = x : myFilter f xs
  | otherwise = myFilter f xs
