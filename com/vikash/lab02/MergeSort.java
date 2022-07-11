package com.vikash.lab02;

public class MergeSort {
	
	void mergeAsc(int arr[], int left, int mid, int right)
	{
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int leftArray[] = new int [n1];
		int rightArray[] = new int [n2];

		for (int i=0; i<n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j=0; j<n2; ++j)
			rightArray[j] = arr[mid + 1+ j];

		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2)
		{
			if (leftArray[i] <= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sortAsc(int arr[], int left, int right)
	{
		if (left < right)
		{
			int mid  = (left+right)/2;

			sortAsc(arr, left, mid);
			sortAsc(arr , mid+1, right);

			mergeAsc(arr, left, mid, right);
		}
	}

	void mergeDsc(int arr[], int left, int mid, int right)
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int leftArray[] = new int [n1];
		int rightArray[] = new int [n2];

		for (int i=0; i<n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j=0; j<n2; ++j)
			rightArray[j] = arr[mid + 1+ j];


		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2)
		{
			if (leftArray[i] >= rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sortDsc(int arr[], int left, int right)
	{
		if (left < right)
		{
			int mid  = (left+right)/2;
			sortDsc(arr, left, mid);
			sortDsc(arr , mid+1, right);
			mergeDsc(arr, left, mid, right);
		}
	}

	public void printArray(int arr[]) {
		for(int index=0; index<arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
	}
}