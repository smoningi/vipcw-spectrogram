/* fft_socket_header.h
 *
 * A file to structurally send fft data through a socket 
 *
 * To read in an FFT, you will first need to read in the header portion (the struct below)
 * The second read will be the fft_data and the size of the read will be dependent on the 
 * 	ptsPerFFT parameter of the previous read.
 * 
 * Author: Ahmed Ismail
 */

#include <stdlib.h>
#include <sys/time.h>

#define END_TRANS = 0xB58C982A
// extern int endTrans = 0xB58C982A;

typedef struct fft_header {
	int constSync;	// sync to next header
	int bytesToNextHeader;	// total amount of space (header+data)
	int samplesToNextFFT;	// Num samples to the start of the next FFT
	int ptsPerFFT;			// number of points per FFT 
	//struct timeval timestamp;	// see getimeofday -> "man gettimeofday"
	int sampleRate;			// sampling frequency
	int	fftRate;		// Number of FFT's per second
	int endTrans;	// signal end of transmission (all data is sent)
} fft_header;
