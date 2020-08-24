package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermutationController {

    @Autowired
    private PermutationService permutationService;

    /***
     *
     * @param numbers
     * @return
     */
    @PostMapping("/store")
    public List<Integer> storeNumbers(@RequestParam int[] numbers) {
        return permutationService.storeNumbers(numbers);
    }

    /****
     *
     * @param id
     * @return
     */

    @GetMapping("/permutation")
    private List<Integer> getPermutation(@RequestParam int id) {
        return permutationService.getPermutation(id);
    }
}
