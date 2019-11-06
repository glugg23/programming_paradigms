module Main where

import Lib

main :: IO ()
main = do
    print $ generateList 9
    print $ myMap succ $ generateList 9
    print $ myFilter even $ generateList 9
