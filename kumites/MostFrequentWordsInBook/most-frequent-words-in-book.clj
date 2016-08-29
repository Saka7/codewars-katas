;; Book URL
(def romeo-and-juliet-book-url "http://www.textfiles.com/etext/AUTHORS/SHAKESPEARE/shakespeare-romeo-48.txt")

;; Finds top 7 most frequent words in the book
(->> 
    (slurp romeo-and-juliet-book-url)
    (re-seq #"\w+")
    (frequencies)
    (sort-by val)
    (reverse)
    (take 7)
    (println))
