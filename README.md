This is linear search approach , as in the question mentioned we need to return the mininmum reversals required
->lets take an example
->][][ = output:1
->If the opening count traversed found we increment the count , else decrement so once the perfect brackets traversed it will be zero , else it will be see the trace of it , at the same time minswaps count will be updated
iteration1: open -> -1 minswaps= -1
iteration2: open -> 0 minswaps= -1
iteration3: open -> -1 minswaps=-1
iteration4: open -> 0 minswaps=-1
return (-minwaps+1)/2= -(-1+1)/2
=1
