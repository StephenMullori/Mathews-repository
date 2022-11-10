let numbers = [43, 56, 33, 23, 44, 36, 5];

// MUTATING ARRAYS
// // Add on to end
// numbers.push(250);
// console.log(numbers);
// // Add on to front
// numbers.unshift(120);
// // Take off from end
// numbers.pop();
// // Take off from front
// numbers.shift();
// // Splice values
// numbers.splice(1, 3);
// console.log(numbers);

console.log(sortArray(numbers));

function sortArray(arr) {
  let updatedArr = arr;

  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length - 1; j++) {
      if (updatedArr[j] > updatedArr[j + 1]) {
        let temp = updatedArr[j];
        updatedArr[j] = updatedArr[j + 1];
        updatedArr[j + 1] = temp;
        console.log(updatedArr);
      }
    }
  }
  return updatedArr;
}

// function bblSort(arr){

//   for(var i = 0; i < arr.length; i++){

//     // Last i elements are already in place
//     for(var j = 0; j < ( arr.length - i -1 ); j++){

//       // Checking if the item at present iteration
//       // is greater than the next iteration
//       if(arr[j] > arr[j+1]){

//         // If the condition is true then swap them
//         var temp = arr[j]
//         arr[j] = arr[j + 1]
//         arr[j+1] = temp
//       }
//     }
//   }
//   // Print the sorted array
//   console.log(arr);
//  }

//  // This is our unsorted array
//  var arr = [234, 43, 55, 63,  5, 6, 235, 547];

//  // Now pass this array to the bblSort() function
//  bblSort(arr);
