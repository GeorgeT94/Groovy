def matcher = "The Hitchhiker's Guide to the Galaxy" =~ /Galaxy/
if (matcher) {
  println "Found the word 'Galaxy'"
}

def m = "Groovy is groovy is gRoovy is GROovy" =~ /(G|g)(r|R)(o|O)ovy/
println m[0][0] // The first whole match (i.e. the first word Groovy)
println m[0][2] // The first group in the first match (i.e. G)
println m[1][0] // The second whole match (i.e. the word groovy)
println m[1][3] // The first group in the second match