Set a = [6, 3, 4, 2, 5, 8]
Set b = [8, 9, 7, 5, 2, 6]
println "Set A : ${a}"
println "Set B: ${b}"
println "A = B : ${a == b}" // equality
println "A + B : ${a + b}" // union
println "A - B : ${a - b}" // difference
println "A symmetric difference B : ${(a-b) + (b-a)}" // symmetric difference
println "A intersection B : ${a.intersect b}" // intersection