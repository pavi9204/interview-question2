package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PermutationService {

    private List<List<Integer>> arrays = new ArrayList<>();

    /***
     *
     * @param numbers
     * @return
     */
    public List<Integer> storeNumbers(int[] numbers) {
        arrays.add(0, Collections.singletonList(0));
        List<List<Integer>> num = permute(numbers);
        for (List<Integer> perm : num) {
            arrays.add(perm);
        }
        return Collections.singletonList(arrays.indexOf(numbers) + 2);
    }

    /***
     *
     * @param id
     * @return
     */
    public List<Integer> getPermutation(int id) {
        return arrays.get(id);
    }

    /***
     *
     * @param arr
     * @return
     */
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), arr);
        return list;
    }

    /***
     *
     * @param list
     * @param resultsList
     * @param arr
     */
    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr) {

        // Base case
        if (resultList.size() == arr.length) {
            list.add(new ArrayList<>(resultList));
        } else {
            for (int i = 0; i < arr.length; i++) {

                if (resultList.contains(arr[i])) {
                    // If element already exists in the list then skip
                    continue;
                }
                // Choose element
                resultList.add(arr[i]);
                // Explore
                permuteHelper(list, resultList, arr);
                // Unchoose element
                resultList.remove(resultList.size() - 1);
            }
        }
    }

}
