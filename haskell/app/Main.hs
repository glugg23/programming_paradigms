module Main where

import Lib

main :: IO ()
main = do
    print $ myMap (+1) [0..9]
    print $ myFilter (even) [0..9]
