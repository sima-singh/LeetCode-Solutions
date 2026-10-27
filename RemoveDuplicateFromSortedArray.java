class Solution {
public int removeDuplicates(int[] a) {
int n = a.length;
int cm = 1;
int officer = 1;
int unique = 1;

    while (cm < n) {
        if (a[cm] == a[cm - 1]) {
            cm++;
            continue;
        } else {
            a[officer] = a[cm];
            cm++;
            unique++;
            officer++;
        }
    }

    return unique;
}

}